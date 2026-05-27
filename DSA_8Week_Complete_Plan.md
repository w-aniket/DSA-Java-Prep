# 🎯 Complete 8-Week DSA Interview Preparation Plan

**Language**: Python or C++
**Goal**: Interview-ready (FAANG companies)  
**Current Level**: Intermediate  
**Time Commitment**: 2-3 hours/day

---

## 📋 Table of Contents
1. [Week 1-2: Foundations](#week-1-2-foundations)
2. [Week 3-4: Core Data Structures](#week-3-4-core-data-structures)
3. [Week 5-6: Algorithms & Problem Solving](#week-5-6-algorithms--problem-solving)
4. [Week 7-8: Trees, Graphs & Advanced](#week-7-8-trees-graphs--advanced)
5. [Daily Schedule Template](#daily-schedule-template)
6. [Resource Links](#resource-links)
7. [Success Metrics](#success-metrics)

---

# WEEK 1-2: FOUNDATIONS

## 🎓 What You'll Learn
- Time & Space Complexity (Big O)
- Python data structures basics
- Problem-solving approach

## 📺 YouTube Videos (Abdul Bari)

### Day 1-2: Introduction & Big O Notation
**Videos to watch** (60 mins total):
- Abdul Bari: "Introduction to Data Structures and Algorithms" (5 mins)
- Abdul Bari: "Asymptotic Notations - Big O, Omega, Theta (Part 1)" (15 mins)
- Abdul Bari: "Asymptotic Notations - Big O, Omega, Theta (Part 2)" (15 mins)
- Abdul Bari: "Time Complexity Analysis" (20 mins)
- Abdul Bari: "Space Complexity Analysis" (5 mins)

**After watching**:
- Take notes on: O(1), O(log n), O(n), O(n²), O(2ⁿ) with examples
- Code 3 simple functions and analyze their complexity

**Note**: Watch at normal speed. Abdul speaks clearly. Pause after each major concept.

---

### Day 3: Arrays & Lists Basics
**Videos to watch** (45 mins):
- Abdul Bari: "Arrays - Basics" (10 mins)
- Abdul Bari: "Array Operations - Insert, Delete, Search" (20 mins)
- Abdul Bari: "Array Rotation" (15 mins)

**After watching**:
- Implement: insertion, deletion, linear search by hand in Python
- Understand indexing and slicing deeply

**Practice on LeetCode** (Easy):
1. "Running Sum of 1d Array" (LeetCode #1480)
2. "Richest Customer Wealth" (LeetCode #1672)
3. "Kids With the Greatest Number of Candies" (LeetCode #1431)

**Time**: 30 mins per problem = 1.5urs

---

### Day 4: Strings (treat as arrays)
**Videos to watch** (30 mins):
- Abdul Bari: "Strings - Basics" (10 mins)
- Abdul Bari: "String Reversal" (10 mins)
- Abdul Bari: "Palindrome Checking" (10 mins)

**After watching**:
- Write string reversal 3 different ways
- Understand string immutability in Python

**Practice on LeetCode** (Easy):
1. "Valid Palindrome" (LeetCode #125)
2. "Reverse String" (LeetCode #344)
3. "First Unique Character in a String" (LeetCode #387)

**Time**: 30 mins per problem = 1.5 hours

---

### Day 5: Python Collections Deep Dive
**Videos to watch** (40 mins):
- freeCodeCamp: Watch first 40 mins of full DSA course (Python setup + collections)
  - Link: Search "freeCodeCamp Data Structures Algorithms" on YouTube

**After watching**:
- Create a cheat sheet:
  - List methods & time complexity
  - Dict/Set operations & time complexity
  - When to use each

**Coding Practice** (no LeetCode):
- Implement: frequency counter using dict
- Implement: check duplicates using set
- Time 30 mins

---

### Day 6: Two-Pointer Technique (First Pattern)
**Videos to watch** (40 mins):
- Abdul Bari: "Two Pointer Technique" (20 mins)
- Tushar Roy: "Two Sum Problem" (20 mins)

**After watching**:
- Understand why two pointers work
- When to use vs hash map

**Practice on LeetCode** (Easy → Medium):
1. "Two Sum II - Input Array Is Sorted" (LeetCode #167) - Easy
2. "Two Sum" (LeetCode #1) - Medium (use hash map approach)

**Time**: 45 mins per problem

---

### Day 7: Sliding Window (Second Pattern)
**Videos to watch** (45 mins):
- Abdul Bari: "Sliding Window Technique" (25 mins)
- Tushar Roy: "Sliding Window Examples" (20 mins)

**After watching**:
- Understand the window expansion/contraction
- When sliding window applies

**Practice on LeetCode** (Easy → Medium):
1. "Maximum Average Subarray I" (LeetCode #643) - Easy
2. "Longest Substring Without Repeating Characters" (LeetCode #3) - Medium

**Time**: 50 mins per problem

---

### Day 8: Problem-Solving Fundamentals (Review)
**What to do** (120 mins):
- Review all 12 LeetCode problems from Week 1
- Re-solve 3 problems from scratch (without looking at solution)
- Identify patterns: when did you use what technique?

**Reflection Exercise**:
- Write down: What made each problem hard? How would you classify them?

---

## ✅ Week 1-2 Checklist
- [ ] Watched all Abdul Bari foundational videos
- [ ] Solved 12 LeetCode Easy problems
- [ ] Understand Big O notation deeply
- [ ] Can identify: arrays, strings, complexity
- [ ] Know two-pointer and sliding window patterns

---

---

# WEEK 3-4: CORE DATA STRUCTURES

## 🎓 What You'll Learn
- Linked Lists (singly, doubly)
- Hash Tables & Hashing
- Stacks & Queues
- Trees intro

## 📺 YouTube Videos

### Day 9-10: Linked Lists
**Videos to watch** (70 mins):
- Abdul Bari: "Linked List - Introduction" (10 mins)
- Abdul Bari: "Linked List - Creation and Display" (15 mins)
- Abdul Bari: "Linked List - Insert, Delete, Search" (20 mins)
- Abdul Bari: "Linked List - Reverse" (15 mins)
- Abdul Bari: "Cycle Detection in Linked List (Floyd's Algorithm)" (10 mins)

**After watching**:
- Implement LinkedListNode class
- Code: insert, delete, search, reverse
- Understand: why we need next pointers

**Practice on LeetCode** (Medium):
1. "Reverse Linked List" (LeetCode #206)
2. "Linked List Cycle" (LeetCode #141)
3. "Merge Two Sorted Lists" (LeetCode #21)
4. "Remove Nth Node From End of List" (LeetCode #19)

**Time**: 45-60 mins per problem

---

### Day 11-12: Hash Tables & Hashing
**Videos to watch** (60 mins):
- Abdul Bari: "Hash Tables - Basics" (15 mins)
- Abdul Bari: "Hash Functions and Collision Handling" (20 mins)
- Tushar Roy: "Hash Map Problem Solving" (25 mins)

**After watching**:
- Understand: hash function, collision handling (linear probing)
- Know when dict/set are optimal
- Practice building frequency maps

**Practice on LeetCode** (Medium):
1. "Valid Anagram" (LeetCode #242) - Easy
2. "Group Anagrams" (LeetCode #49) - Medium
3. "Contains Duplicate II" (LeetCode #219) - Medium
4. "LRU Cache" (LeetCode #146) - Hard (optional, for stretch)

**Time**: 40 mins for Easy, 50+ mins for Medium

---

### Day 13: Stacks
**Videos to watch** (45 mins):
- Abdul Bari: "Stack - Basics and Implementation" (15 mins)
- Abdul Bari: "Stack - Applications (Balanced Parentheses)" (20 mins)
- Tushar Roy: "Monotonic Stack" (10 mins)

**After watching**:
- Implement stack from scratch
- Understand LIFO principle
- Know when to use stack vs queue

**Practice on LeetCode** (Easy → Medium):
1. "Valid Parentheses" (LeetCode #20) - Easy
2. "Daily Temperatures" (LeetCode #739) - Medium 

**Time**: 40 mins per problem

---

### Day 14: Queues
**Videos to watch** (40 mins):
- Abdul Bari: "Queue - Basics and Implementation" (15 mins)
- Abdul Bari: "Circular Queue" (15 mins)
- Abdul Bari: "Queue - Applications" (10 mins)

**After watching**:
- Implement queue (array-based)
- Understand FIFO principle
- Know: when queue needed

**Practice on LeetCode** (Easy):
1. "Number of Recent Calls" (LeetCode #933)
2. "Reveal Cards In Increasing Order" (LeetCode #950)

**Time**: 30 mins per problem

---

### Day 15: Trees Intro (Definitions & Traversals)
**Videos to watch** (60 mins):
- Abdul Bari: "Trees - Basics and Terminology" (15 mins)
- Abdul Bari: "Binary Trees - DFS Traversals (Inorder, Preorder, Postorder)" (20 mins)
- Abdul Bari: "Binary Trees - BFS (Level Order)" (15 mins)
- Abdul Bari: "Binary Search Tree - Basics" (10 mins)

**After watching**:
- Draw different tree types
- Implement: inorder, preorder, postorder by hand
- Understand DFS vs BFS

**Practice on LeetCode** (Medium):
1. "Binary Tree Inorder Traversal" (LeetCode #94)
2. "Binary Tree Level Order Traversal" (LeetCode #102)

**Time**: 45 mins per problem

---

### Day 16: Trees - BST Operations
**Videos to watch** (50 mins):
- Abdul Bari: "BST - Insert and Search" (20 mins)
- Abdul Bari: "BST - Delete" (20 mins)
- Tushar Roy: "Lowest Common Ancestor in BST" (10 mins)

**After watching**:
- Implement: insert, search, delete in BST
- Understand why BST is useful (O(log n) operations)

**Practice on LeetCode** (Medium):
1. "Validate Binary Search Tree" (LeetCode #98)
2. "Kth Smallest Element in a BST" (LeetCode #230)
3. "Lowest Common Ancestor of a Binary Search Tree" (LeetCode #235)

**Time**: 50 mins per problem

---

### Day 17: Review Week 3-4
**What to do** (120 mins):
- Re-solve 5 problems from this week (without hints)
- Track which were easy, which were hard
- Identify weak areas

**Weak Area?**
- Linked Lists hard? → Watch Abdul Bari again + code from scratch
- Trees confusing? → Draw 10 trees by hand, label nodes
- Stack/Queue unclear? → Implement both completely from scratch

---

## ✅ Week 3-4 Checklist
- [ ] Implemented: LinkedList, Stack, Queue, BST classes
- [ ] Solved 13+ LeetCode Medium problems
- [ ] Understand all tree traversals
- [ ] Can reverse a linked list in <10 mins
- [ ] Know: hash map collisions, BST properties

---

---

# WEEK 5-6: ALGORITHMS & PROBLEM SOLVING

## 🎓 What You'll Learn
- Sorting algorithms (and WHY they work)
- Binary search variations
- Recursion & Backtracking
- Dynamic Programming intro

## 📺 YouTube Videos & Practice

### Day 18-19: Sorting Algorithms Theory
**Videos to watch** (80 mins):
- Abdul Bari: "Bubble Sort" (12 mins)
- Abdul Bari: "Insertion Sort" (10 mins)
- Abdul Bari: "Selection Sort" (10 mins)
- Abdul Bari: "Merge Sort - Complete" (20 mins)
- Abdul Bari: "Quick Sort - Complete" (20 mins)
- Abdul Bari: "Heap Sort" (8 mins)

**After watching**:
- Create table: Algorithm | Time | Space | Stable?
- Code each from scratch (don't copy-paste)
- Understand: why merge sort O(n log n) guaranteed

**Note**: You won't practice sorting on LeetCode much. Focus on UNDERSTANDING.

**Coding Practice** (no LeetCode):
- Implement all 6 sorts
- Verify on random arrays
- Time: 90 mins total

---

### Day 20: Binary Search Deep Dive
**Videos to watch** (50 mins):
- Abdul Bari: "Binary Search - Basics" (15 mins)
- Abdul Bari: "Binary Search - Variations (First/Last Occurrence)" (20 mins)
- Tushar Roy: "Binary Search Interview Problems" (15 mins)

**After watching**:
- Understand: when binary search applies (sorted + something)
- Know: edge cases (empty array, single element)
- Learn: binary search on answer

**Practice on LeetCode** (Medium):
1. "Binary Search" (LeetCode #704) - Basics
2. "First Bad Version" (LeetCode #278) - Variation
3. "Search in Rotated Sorted Array" (LeetCode #33) - Hard (after mastering basics)
4. "Find Peak Element" (LeetCode #162) - Medium

**Time**: 40 mins per problem

---

### Day 21: Recursion Fundamentals
**Videos to watch** (60 mins):
- Abdul Bari: "Recursion - Basics and Call Stack" (15 mins)
- Abdul Bari: "Recursion - Direct vs Indirect" (10 mins)
- Abdul Bari: "Recursion - Example Problems" (20 mins)
- Tushar Roy: "Backtracking Introduction" (15 mins)

**After watching**:
- Draw call stacks for recursive calls
- Understand: base case, recursive case
- Know: when recursion is overkill

**Coding Practice** (no LeetCode):
- Implement: factorial, fibonacci, power
- Trace through manually on paper
- Time: 45 mins

---

### Day 22: Backtracking & Permutations
**Videos to watch** (50 mins):
- Abdul Bari: "Backtracking - N-Queens Problem" (25 mins)
- Tushar Roy: "Generate All Permutations" (15 mins)
- Tushar Roy: "Combinations and Subsets" (10 mins)

**After watching**:
- Understand backtracking pattern (choose, explore, unchoose)
- Know why we need recursion for this

**Practice on LeetCode** (Medium → Hard):
1. "Permutations" (LeetCode #46) - Medium
2. "Combinations" (LeetCode #77) - Medium
3. "Generate Parentheses" (LeetCode #22) - Medium
4. "Word Search II" (LeetCode #212) - Hard (optional)

**Time**: 60-90 mins per problem (backtracking takes time!)

---

### Day 23: Memoization & DP Intro
**Videos to watch** (50 mins):
- Abdul Bari: "Memoization vs Tabulation" (15 mins)
- freeCodeCamp: "Dynamic Programming Intro" (20 mins from DP section)
- Tushar Roy: "Fibonacci - Recursive vs Memoization vs DP" (15 mins)

**After watching**:
- Understand: DP is optimized recursion
- Know: when to use DP (overlapping subproblems + optimal substructure)

**Practice on LeetCode** (Easy → Medium):
1. "Climbing Stairs" (LeetCode #70) - Easy
2. "House Robber" (LeetCode #198) - Medium
3. "Coin Change" (LeetCode #322) - Medium

**Time**: 40 mins per problem

---

### Day 24: More DP Problems (1D)
**Videos to watch** (30 mins):
- Tushar Roy: "1D DP Problems" (30 mins)

**Practice on LeetCode** (Medium):
1. "Longest Increasing Subsequence" (LeetCode #300)
2. "Word Break" (LeetCode #139)

**Time**: 60 mins per problem

---

### Day 25: Review Week 5-6
**What to do** (120 mins):
- Pick 2 sorting algorithms → implement from scratch
- Re-solve 3 recursion/backtracking problems
- Re-solve 3 DP problems

**Reflection**:
- Which topics felt hard? (Likely: backtracking, DP)
- Need more practice? Do 1-2 extra LeetCode problems

---

## ✅ Week 5-6 Checklist
- [ ] Implemented all 6 sorting algorithms
- [ ] Understand binary search variations
- [ ] Can code recursion without overthinking
- [ ] Solved 10+ backtracking/DP problems
- [ ] Know DP pattern (state, transition, base case)

---

---

# WEEK 7-8: TREES, GRAPHS & ADVANCED

## 🎓 What You'll Learn
- Graph representations & algorithms
- DFS & BFS deep dive
- Union-Find
- Mock interviews

## 📺 YouTube Videos & Practice

### Day 26-27: Graph Basics & Representations
**Videos to watch** (60 mins):
- Abdul Bari: "Graph - Basics and Representations" (20 mins)
- Abdul Bari: "Graph - Adjacency Matrix vs List" (15 mins)
- Tushar Roy: "DFS and BFS in Depth" (25 mins)

**After watching**:
- Draw graphs: directed, undirected, weighted
- Implement: adjacency list, adjacency matrix
- Understand: DFS (stack/recursion) vs BFS (queue)

**Coding Practice**:
- Implement DFS from scratch
- Implement BFS from scratch
- Test on simple graphs
- Time: 60 mins

---

### Day 28: Graph Traversals - LeetCode Problems
**Practice on LeetCode** (Medium):
1. "Number of Islands" (LeetCode #200) - DFS/BFS classic
2. "Clone Graph" (LeetCode #133) - Graph representation
3. "Walls and Gates" (LeetCode #286) - BFS application

**Time**: 50 mins per problem

---

### Day 29: Topological Sort & Advanced Graph
**Videos to watch** (40 mins):
- Abdul Bari: "Topological Sort" (20 mins)
- Tushar Roy: "Topological Sort - Kahn's Algorithm" (10 mins)
- Tushar Roy: "Cycle Detection in Graphs" (10 mins)

**After watching**:
- Understand when topological sort applies
- Know: DFS-based and Kahn's algorithm
- Understand cycle detection

**Practice on LeetCode** (Medium):
1. "Course Schedule" (LeetCode #207) - Cycle detection
2. "Course Schedule II" (LeetCode #210) - Topological sort

**Time**: 60 mins per problem

---

### Day 30: Union-Find (Disjoint Set)
**Videos to watch** (45 mins):
- Abdul Bari: "Union-Find - Introduction" (20 mins)
- Tushar Roy: "Union-Find - Path Compression & Union by Rank" (15 mins)
- Tushar Roy: "Union-Find Applications" (10 mins)

**After watching**:
- Implement union-find data structure
- Understand: path compression, union by rank
- Know: when it's useful (connectivity problems)

**Practice on LeetCode** (Medium):
1. "Redundant Connection" (LeetCode #684)
2. "Number of Connected Components in an Undirected Graph" (LeetCode #323)

**Time**: 60 mins per problem

---

### Day 31: Shortest Path - Dijkstra & BFS
**Videos to watch** (50 mins):
- Abdul Bari: "Dijkstra's Algorithm" (25 mins)
- Tushar Roy: "Shortest Path - BFS vs Dijkstra" (15 mins)
- Tushar Roy: "BFS for Shortest Path" (10 mins)

**After watching**:
- Understand: when to use BFS (unweighted) vs Dijkstra (weighted)
- Know: how Dijkstra works (greedy + priority queue)

**Practice on LeetCode** (Medium → Hard):
1. "Shortest Path in Binary Matrix" (LeetCode #1091) - BFS
2. "Network Delay Time" (LeetCode #743) - Dijkstra

**Time**: 70 mins per problem

---

### Day 32: Advanced Trees & Misc
**Videos to watch** (45 mins):
- Tushar Roy: "Lowest Common Ancestor (General Trees)" (15 mins)
- Tushar Roy: "Path Sum Trees Problems" (15 mins)
- Tushar Roy: "Serialize/Deserialize Binary Tree" (15 mins)

**Practice on LeetCode** (Medium → Hard):
1. "Lowest Common Ancestor of a Binary Tree" (LeetCode #236)
2. "Path Sum II" (LeetCode #113)
3. "Serialize and Deserialize Binary Tree" (LeetCode #297) - Hard

**Time**: 60-90 mins per problem

---

### Day 33: Mock Interviews & Wrap-up
**What to do** (120 mins):

**Option A: Self Mock Interview**
- Pick 1 Medium + 1 Hard problem you haven't seen
- Solve in 50 mins (like real interview)
- Check solution, note what you missed

**Option B: Peer Mock Interview**
- Use Pramp (pramp.com) - free peer interviews
- Do 1 full mock interview (45 mins)
- Get feedback

**Option C: Re-solve Hard Problems**
- Pick 3 hardest problems from weeks 1-8
- Solve them end-to-end
- Measure improvement

---

### Day 34: Final Review & Celebration
**What to do**:

1. **Create Personal Notes** (30 mins):
   - One-page summary per data structure
   - One-page summary per algorithm
   - Common patterns and when to use them

2. **Identify Weak Areas** (30 mins):
   - Which topics do you struggle with?
   - Which problems took longest?
   - Plan to revisit these

3. **Track Progress** (30 mins):
   - Count: how many problems solved?
   - Count: how many patterns learned?
   - Rate confidence: 1-10 for each topic

4. **Plan Next Steps**:
   - Ready for interviews? → Start mock interviews on Pramp
   - Need more practice? → Focus on weak areas
   - Want system design? → Move to system design after 1-2 weeks

---

## ✅ Week 7-8 Checklist
- [ ] Implemented DFS, BFS, Union-Find, Dijkstra
- [ ] Solved 12+ graph and advanced tree problems
- [ ] Understand all graph algorithms
- [ ] Did 1+ mock interviews
- [ ] Created personal note sheet
- [ ] Ready for real interviews!

---

---

# DAILY SCHEDULE TEMPLATE

Use this template every day during your 8-week prep:

## Morning (30 mins)
- Review yesterday's concepts (10 mins)
- Watch new YouTube video (20 mins)
- *Goal: Understand new concept*

## Afternoon (60 mins)
- Code what you learned (30 mins)
  - Implement data structure or algorithm from scratch
  - Test on simple examples
- Solve 1 Easy LeetCode problem (30 mins)
  - Code without looking at solution first
  - Read solution afterward if needed

## Evening (60 mins)
- Solve 1 Medium LeetCode problem (50 mins)
  - Can spend 30 mins thinking before coding
  - Take hints if needed
  - Must finish it tonight
- Reflect on your learning (10 mins)
  - What was hard?
  - What pattern did you see?

### Optional Extra (30 mins, if time)
- Watch Tushar Roy video for another angle
- Solve 1 more Easy problem
- Review notes on weak topics

---

**Daily Total**: 2-2.5 hours minimum (can go to 3-3.5 if you have time)

**Weekly Pattern**:
- Monday-Friday: Full schedule (2-3 hours)
- Saturday: Review day + 1 mock interview practice
- Sunday: Rest or light review

---

---

# RESOURCE LINKS

## YouTube Channels

### Primary Sources
- **Abdul Bari**: https://www.youtube.com/@AbdulBariYouTube
  - Best for: Theory and deep understanding
  - Start here for every new topic

- **Tushar Roy**: https://www.youtube.com/@tusharroy2525
  - Best for: Problem-solving patterns
  - Watch after understanding theory

- **freeCodeCamp DSA**: Search "freeCodeCamp Data Structures Algorithms" on YouTube
  - Best for: Complete structured course
  - Watch first 40 mins → then return as reference

### Supplementary (If Stuck)
- Neso Academy: Good for alternative explanations
- Nick White: Great for LeetCode walkthroughs

## Practice Platforms

1. **LeetCode**: https://leetcode.com
   - Free tier sufficient for this plan
   - Premium ($160/year) worth it for company-specific problems
   - Problem counts by difficulty: Easy ~800, Medium ~1500, Hard ~600

2. **HackerRank**: https://www.hackerrank.com
   - Good if LeetCode feels overwhelming
   - Has tutorials built-in

3. **GeeksforGeeks**: https://www.geeksforgeeks.org
   - For reading explanations (not practice)
   - Use when YouTube video isn't clear

4. **Pramp**: https://www.pramp.com
   - Free peer mock interviews
   - Start Week 7

## Books (Optional, for Reference)
- "Cracking the Coding Interview" by Gayle McDowell
- "Introduction to Algorithms" (CLRS) - heavy, but best reference

---

---

# SUCCESS METRICS

## By End of Week 2
- [ ] Solved 12 LeetCode problems
- [ ] Understand Big O deeply
- [ ] Know two-pointer, sliding window patterns
- **Confidence**: Should feel comfortable with arrays/strings

## By End of Week 4
- [ ] Solved 13+ LeetCode Medium problems
- [ ] Implemented: LinkedList, Stack, Queue, BST
- [ ] Can reverse linked list in <10 mins
- **Confidence**: Should feel solid on data structures

## By End of Week 6
- [ ] Solved 10+ recursion/backtracking/DP problems
- [ ] Can code all 6 sorting algorithms
- [ ] Understand DP state transitions
- **Confidence**: Should recognize patterns in new problems

## By End of Week 8
- [ ] Solved 50+ LeetCode problems total
- [ ] Implemented all major data structures + algorithms
- [ ] Completed 1+ mock interviews
- [ ] Solved 15+ Medium problems in <45 mins each
- **Confidence**: READY FOR INTERVIEWS!

---

## Problem Count Target
- **Week 1-2**: 12 problems
- **Week 3-4**: 13 problems
- **Week 5-6**: 13+ problems
- **Week 7-8**: 15+ problems
- **Total**: 50+ problems

---

## Interview Readiness Checklist (Before Applying)
- [ ] Can solve Easy/Medium in <30-40 mins
- [ ] Understand complexity tradeoffs
- [ ] Know when to use each data structure
- [ ] Can explain your approach (not just code)
- [ ] Did 3+ mock interviews
- [ ] Can handle edge cases
- [ ] Know 10+ common patterns
- [ ] Can write clean, readable code

---

---

# FINAL TIPS FOR SUCCESS

## 1. **Consistency Over Intensity**
- 2.5 hours every day > 5 hours 3 times a week
- Build habit, don't burn out

## 2. **Code > Watching**
- 30% watching, 70% coding
- Don't fall into "tutorial trap"

## 3. **Understand > Memorize**
- Ask "why" for every algorithm
- Don't memorize solutions

## 4. **Mistakes Are Data**
- If you get a problem wrong, analyze WHY
- Don't just move on

## 5. **Track Progress**
- Keep a log: date | problem | time taken | difficulty (1-10)
- Watch improvement

## 6. **Join Communities**
- r/learnprogramming on Reddit
- LeetCode discuss sections
- Helps with motivation

## 7. **Revisit Hard Problems**
- After 2 weeks, re-solve hard problems
- You'll solve them much faster (confidence boost!)

## 8. **Take Breaks**
- 50 mins work, 10 mins break
- Full day off per week
- Prevents burnout

---

# WHAT AFTER 8 WEEKS?

### If You're Ready (Solved 50+ problems, did 3+ mocks):
1. Start applying to companies
2. Do company-specific problem prep (LeetCode Premium)
3. Continue with 10-15 mins daily practice

### If You Need More Time:
1. Identify weak areas (graphs? DP? backtracking?)
2. Do 15-20 more problems on weak topics
3. Do 3-5 more mock interviews
4. Don't rush — quality over speed

### System Design (After DSA):
- Start learning system design (separate 4-week course)
- But master DSA first!

---

---

## 📞 How to Use This Plan

1. **Print it or bookmark it**
2. **Follow day-by-day** (don't skip ahead)
3. **Adjust if needed** (if a topic takes 2 days instead of 1, that's OK)
4. **Track progress** with the checkboxes
5. **Revisit this plan** when feeling lost

**Remember**: This is a GUIDE, not a law. If something doesn't work, adjust. The goal is MASTERY, not speed.

---

**Good luck! You've got this! 💪**
**Good luck**