class ArrayRep{
    int root=0;
    //Array to represent Binary Tree
    String[] array=new String[10];

    //create root
    void createRoot(String key){
        array[0]=key;
    }
    void createLeftChild(String key, int root){
        int t=(2*root)+1;
        if(array[root]==null){
            System.out.printf("Can't set child at %d, no parent found",t);
        }
        else {
            array[t]=key;
        }
    }
    void createRightChild(String key, int root){
        int t=(2*root)+2;
        if(array[root]==null){
            System.out.printf("Can't set child at %d, no parent found",t);
        }
        else {
            array[t]=key;
        }
    }
    void printTree(){
        for(int i=0;i<10;i++){
            if(array[i]!=null)
                System.out.print(array[i]+" ");
        }
    }
}
public class BinaryTreeArray {
    public static void main(String[] args) {
        /**
         *          A(0)
         *         /   \
         *      B(1)   C(2)
         *     /  \    /
         *  D(3)  E(4) F(6)
         */
        ArrayRep arrayRep=new ArrayRep();
        arrayRep.createRoot("A");
        arrayRep.createLeftChild("B",0);
        arrayRep.createRightChild("C",0);
        arrayRep.createLeftChild("D",1);
        arrayRep.createRightChild("E",1);
        arrayRep.createLeftChild("F",2);
        arrayRep.printTree();
    }
}
