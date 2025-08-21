# Trie (Prefix Tree) Notes

A **Trie** is a tree-like data structure used to store strings, where each node represents a character of the key.  
It is especially **efficient for prefix-based searches** (e.g., autocomplete, dictionary lookup, spell-checkers).

---

## 🌟 Key Properties
- Each **path from root to a node** represents a prefix of one or more stored keys.
- Each node contains:
  - **Children** (usually stored as an array or hash map).
  - **End-of-Word marker** (boolean) to distinguish between a complete word and a prefix.
- Common prefixes are stored **once**, reducing redundancy.  
  Example: storing `Coat`, `Cup`, `Car` → the prefix `"C"` is stored once, branching into `"o"`, `"u"`, and `"a"`.

---

## ⚡ Complexity
- **Insertion:** `O(L)` where `L` is the length of the word.
- **Search:** `O(L)`
- **Prefix search:** `O(L)`
- **Deletion:** `O(L)` (with backtracking to clean up unused nodes).
- **Space:** Can be large in the naive implementation (since each node can have up to 26 children for lowercase English letters). Optimizations:
  - Use a `HashMap` instead of a fixed array.
  - Use **compressed tries** (Radix Trees / Patricia Tries).

---

## ✍️ Algorithm for Insertion in a Trie

Say we want to insert a word `W` into a Trie:

1. **Start at the root.**
2. For each character `c` in the word:
   - If `c` does **not exist** as a child → create a new node.
   - Move to the child node representing `c`.
3. After the last character → **mark the node as end-of-word.**

### 🧠 Easy way to remember:
👉 **"Check → Create → Move → Mark"**

### ✅ Example: Insert `"cat"`
- Start at root.  
- `'c'` not there → create `'c'` → move.  
- `'a'` not there → create `'a'` → move.  
- `'t'` not there → create `'t'` → move.  
- Mark `'t'` as end-of-word.  

---

## 🔍 Algorithm for Search in a Trie

Given a word `W` you want to search:

1. **Start at the root.**
2. For each character `c` in the word:
   - If `c` exists as a child → move to that child.
   - If `c` does **not** exist → the word is not in the Trie.
3. After processing all characters:
   - If the current node is marked as **end-of-word** → ✅ the word exists.
   - If not → ❌ the word is only a prefix, not a stored word.

### 🧠 Easy way to remember:
👉 **"Check → Move → End?"**

### ✅ Example: Search `"cat"`
Trie structure:
` (root) → c → a → t (end-of-word)`

Steps:
- Root → `'c'` exists → move.  
- `'a'` exists → move.  
- `'t'` exists → move.  
- Node `'t'` is marked end-of-word → ✅ `"cat"` found.  

### ❌ Example: Search `"can"`
- Root → `'c'` exists → move.  
- `'a'` exists → move.  
- `'n'` exists → move.  
- End of word reached, but `'n'` is **not marked end-of-word** → `"can"` is only a prefix.

---

## ✂️ Deletion in Trie (Simplified)
To delete a word:
1. Traverse the word as in search.
2. If the word does not exist → nothing to delete.
3. If it exists:
   - Unmark the **end-of-word**.
   - If the node has no children → recursively delete unused nodes.

---

## 🔧 Common Operations
- **Insert(word)** → Add a word to the Trie.  
- **Search(word)** → Check if a word exists in the Trie.  
- **StartsWith(prefix)** → Check if any word starts with a given prefix.  
- **Delete(word)** → Remove a word from the Trie.  

---

## 📌 Applications of Tries
- Autocomplete systems (e.g., search bars).
- Spell-checkers.
- Word games (e.g., Scrabble, Boggle).
- IP routing (longest prefix matching).
- Dictionary storage.
- Genome sequence matching (bioinformatics).

---
