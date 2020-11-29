# LeetCode 解题框架

## 1. 二叉树（Binary Tree）

### 二叉树的遍历

#### 递归遍历

时间复杂度：O(N)

空间复杂度：O(N)

* 前序遍历

```java
void preorder(TreeNode root) {
    if (root == null) {
        return;
    }
    // 前序遍历代码位置
    preorder(root.left);
    preorder(root.right);
}
```

* 中序遍历

```java
void inorder(TreeNode root) {
    if (root == null) {
        return;
    }
    inorder(root.left);
    // 中序遍历代码位置
    inorder(root.right);
}
```

* 后序遍历

```java
void postorder(TreeNode root) {
    if (root == null) {
        return; 
    }
    postorder(root.left);
    postorder(root.right);
    // 后序遍历代码位置
}
```

#### 迭代遍历

时间复杂度：O(N)

空间复杂度：O(N)

* 前序遍历

```java
void preorder(TreeNode root) {
    if (root == null) {
        return;
    }
    Stack<TreeNode> stack = new Stack<>();
    while (root != null || !stack.empty()) {
        while (root != null) {
            // 前序遍历代码位置
            System.out.print(root.val+" ");
            stack.push(root);
            root = root.left;
        }
        while (root == null && !stack.empty()) {
            root = stack.pop().right;
        }
    }
}
```

* 中序遍历

```java
void inorder(TreeNode root) {
    if (root == null) {
        return;
    }
    Stack<TreeNode> stack = new Stack<>();
    while (root != null || !stack.empty()) {
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
        root = stack.pop();
        // 中序遍历代码位置
        System.out.print(root.val+" ");
        root = root.right;
    }
}
```

* 后序遍历

```java
void postorder(TreeNode root) {
    if (root == null) {
        return;
    }
    Stack<TreeNode> stack = new Stack<>();
    TreeNode pre = null;
    while (root != null || !stack.empty()) {
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
        root = stack.peek();
        if (root.right == null || root.right == pre) {
            // 后序遍历代码位置
            System.out.print(root.val+" ");
            pre = root;
            root = null;
        } else {
            root = root.right;
        }
    }
}
```

#### Morris 遍历

时间复杂度：O(N)

空间复杂度：O(1)

* 前序遍历

```java 
void preorder(TreeNode root) {
    if (root == null) {
        return;
    }
    TreeNode cur = root;
    TreeNode mostRight = null;
    while (cur != null) {
        mostRight = cur.left;
        if (mostRight != null) {
            while (mostRight.right != null && mostRight.right != cur) {
                mostRight = mostRight.right;
            }
            if (mostRight.right == null) {
                mostRight.right = cur;
                // 前序遍历代码位置
                System.out.print(cur.val+" ");
                cur = cur.left;
                continue;
            } else {
                mostRight.right = null;
            }
        } else {
            // 前序遍历代码位置
            System.out.print(cur.val+" ");
        }
        cur = cur.right;
    }
}
```

* 中序遍历

```java
void inorder(TreeNode root) {
    if (root == null) {
        return;
    }
    TreeNode cur = root;
    TreeNode mostRight = null;
    while (cur != null) {
        mostRight = cur.left;
        if (mostRight != null) {
            while (mostRight.right != null && mostRight.right != cur) {
                mostRight = mostRight.right;
            }
            if (mostRight.right == null) {
                mostRight.right = cur;
                cur = cur.left;
                continue;
            } else {
                mostRight.right = null;
            }
        }
        // 中序遍历代码位置
        System.out.print(cur.val+" ");
        cur = cur.right;
    }
}
```

* 后序遍历

```java
void postorder(TreeNode root) {
    if (root == null) {
        return;
    }
    TreeNode cur = root;
    TreeNode mostRight = null;
    while (cur != null) {
        mostRight = cur.left;
        if (mostRight != null) {
            while (mostRight.right != null && mostRight.right != cur) {
                mostRight = mostRight.right;
            }
            if (mostRight.right == null) {
                mostRight.right = cur;
                cur = cur.left;
                continue;
            } else {
                mostRight.right = null;
            }
        }
    }
}

void printEdge(TreeNode node) {
    TreeNode tail = reverseEdge(node);
    TreeNode cur = tail;
    while (cur != null) {
        // 后序遍历代码位置
        System.out.print(cur.val+" ");
        cur = cur.right;
    }
    reverseEdge(tail);
}

TreeNode reverseEdge(TreeNode node) {
    TreeNode pre = null;
    TreeNode next = null;
    while (node != null) {
        next = node.right;
        node.right = pre;
        pre = node;
        node = next;
    }
    return pre;
}
```



