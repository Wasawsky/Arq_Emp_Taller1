package edu.escuelaing.arep.taller1.app;

/**
 * Estructura de datos encadenada por nodos
 */
public class LinkedList 
{
    private Node firstNode;
    private Node lastNode;

    public LinkedList() {
        this.firstNode = null;
        this.lastNode = null;
    }

    public LinkedList(Double[] array){
        for (int i=0;i<array.length;i++){
            this.add(array[i]);
        }
    }


    public void add(Double n){
        Node t = new Node(n);
        if (this.isEmpty()){
            t.setNextNode(t);
            this.firstNode = this.lastNode = t;
        }else{
            this.lastNode.setNextNode(t);
            this.lastNode = t;
            this.lastNode.setNextNode(this.firstNode);
        }
    }

    public int size(){
        int length = 1;
        Node temp = firstNode;
        while (temp.getNextNode()!=lastNode.getNextNode()){
            length++;
            temp=temp.getNextNode();
        }
        return length;
    }

    public void remove(int node){
        Node temp = firstNode;
        int flag = 1;
        while (flag<=node){
            if(flag==node-1){
                temp.setNextNode(temp.getNextNode().getNextNode());
            }else{
                temp=temp.getNextNode();
            }
            flag++;
        }
    }

    public Double[] toArray(){
        Node temp = firstNode;
        Double[] array = new Double[this.size()];
        for (int i = 0; i<this.size();i++){
            array[i] = temp.getValue();
            temp=temp.getNextNode();
        }
        return array;
    }
    public boolean isEmpty(){
        return firstNode == lastNode && lastNode == null;
    }

    public void preview(){
        Node temp = firstNode;
        for (int i = 0; i<this.size();i++){
            System.out.println(temp.getNextNode().getValue());
            temp=temp.getNextNode();
        }
    }

    public Node getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(Node firstNode) {
        this.firstNode = firstNode;
    }

    public Node getLastNode() {
        return lastNode;
    }

    public void setLastNode(Node lastNode) {
        this.lastNode = lastNode;
    }
    
    @Override
    public String toString() {
        return "Primer Nodo: " + firstNode.getValue() + " Ultimo Nodo: " + lastNode.getValue();
    }

    public static void main(String[] args) {
        //LinkedList lista = new LinkedList();
        //int[] array = {1,5,7,5};
        //LinkedList lista = new LinkedList(array);
        //System.out.println(lista.isEmpty());
        //lista.add(1);
        //lista.add(3);
        //lista.add(7);
        //lista.add(10);
        //lista.add(15);
        //System.out.println(lista.toString());
        //System.out.println(lista.size());
        //System.out.println(lista.isEmpty());
        //lista.preview();
        //lista.remove(3);
        //System.out.println();
        //lista.preview();
    }

    
}

