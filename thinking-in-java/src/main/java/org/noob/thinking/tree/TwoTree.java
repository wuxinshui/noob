package org.noob.thinking.tree;

import java.util.ArrayList;
import java.util.List;

public class TwoTree {

    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {

        Node node = new Node(1);
        node.left = new Node(3);
        node.right = new Node(5);
        node.left.left = new Node(2);
        node.right.right = new Node(4);

        System.out.println(preOrder(node));
    }

    static class Node {
        private int value;
        private Node left;
        private Node right;


        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Node(int value) {
            this.value = value;
        }
    }

    /**
     * 递归实现
     *
     * @param root
     * @return
     */
    public static List<Integer> preOrder(Node root) {
        if (root == null) {
            return list;
        }
        list.add(root.value);
        preOrder(root.left);
        preOrder(root.right);

        return list;

    }


    /**废弃***/
    /**
     * 前序
     *
     * @param head
     * @return
     */
    public String list(Node head) {

        StringBuilder sb = new StringBuilder();

        sb.append(head.value);

        Node curr = head.left;

        do {
            if (curr.left != null) {
                sb.append(curr.left.value);
            }

            if (curr.right != null) {
                sb.append(curr.right.value);
            }

            curr = curr.left;

        } while (curr.left != null);

        curr = head.right;

        do {

            sb.append(curr.value);

            if (curr.right != null) {
                sb.append(curr.right.value);
            }

            curr = curr.right;

        } while (curr.right != null);


        return sb.toString();
    }
}
