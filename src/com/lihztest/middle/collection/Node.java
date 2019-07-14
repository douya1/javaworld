package com.lihztest.middle.collection;

import java.util.ArrayList;
import java.util.List;

public class Node {

    public Node leftNode;
    public Node rightNode;
    public Object value;

    public void add(Object v){
        if(null == value)
            this.value = v;

        else
        {
            if((Integer) v - (Integer)value <= 0){
                if(null == leftNode)
                    leftNode = new Node();
                leftNode.add(v);
            }
            else{
                if(null == rightNode)
                    rightNode = new Node();
                rightNode.add(v);
            }
        }

    }
    // 中序遍历所有的节点
    public List<Object> values() {
        List<Object> values = new ArrayList<>();

        // 左节点的遍历结果
        if (null != leftNode)
            values.addAll(leftNode.values());

        // 当前节点
        values.add(value);

        // 右节点的遍历结果
        if (null != rightNode)

            values.addAll(rightNode.values());

        return values;
    }

    public static void main(String[] args) {

        int randoms[] = new int[]{4,54,3,90,3,49,9,20,20,34,2,0,21};

        Node rootNode = new Node();
        for(int i:randoms)
            rootNode.add(i);
        System.out.println(rootNode.values());
    }
}
