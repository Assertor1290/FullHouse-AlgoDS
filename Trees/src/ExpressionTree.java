

/**
 * <p> Node Class</p>
 */
class NodeExp{
    String input;
    NodeExp left,right;
    NodeExp(String input){
        this.input=input;
        left=right=null;
    }
}

/**
 * Expression Tree class
 */
public class ExpressionTree {
    NodeExp root;
    ExpressionTree(){
        root=null;
    }

    /**
     * Function to return int value of String
     * @param str the operand in String
     * @return int value of operand
     */
    public int toInt(String str){
        int num=0;
        //If it is not negative number
        if(str.charAt(0)!='-'){
            for(int i=0;i<str.length();i++){
                //-48 is done from ASCII value of given character to convert to int
                num= num*10 + (str.charAt(i)-48);
            }
        }
        //If it is negative number
        else{
            //Start from second character ignoring the negative sign
            for(int i=1;i<str.length();i++){
                num= num*10 + (str.charAt(i)-48);
                //convert back to negative number
                num= num*-1;
            }
        }
        return num;
    }

    /**
     * Function to evaluate Expression tree
     * @param root Root node of Expression tree
     * @return value after evaluating
     */
    public int evaluate(NodeExp root){
        if(root==null)
            return 0;

        //Check if it is leaf node. If it is leaf node => It is operand
        if(root.left==null && root.right==null){
            return toInt(root.input);
        }
        //Evaluate left subtree
        int l_value= evaluate(root.left);
        //Evaluate right subtree
        int r_value= evaluate(root.right);

        //Check which operator to apply
        if(root.input.equals("+")){
            return l_value+r_value;
        }
        if(root.input.equals("-")){
            return l_value-r_value;
        }
        if(root.input.equals("/")){
            return l_value/r_value;
        }
        return l_value*r_value;
    }

    public static void main(String[] args) {

        ExpressionTree expressionTree=new ExpressionTree();
        /**
         * Expression Tree to be evaluated.
         *               +
         *            /    \
         *           *      -
         *          / \    /  \
         *         5  4   100  20
         */
        expressionTree.root= new NodeExp("+");
        expressionTree.root.left = new NodeExp("*");
        expressionTree.root.left.left = new NodeExp("5");
        expressionTree.root.left.right = new NodeExp("4");
        expressionTree.root.right = new NodeExp("-");
        expressionTree.root.right.left = new NodeExp("100");
        expressionTree.root.right.right = new NodeExp("20");

        System.out.println(expressionTree.evaluate(expressionTree.root));

    }
}
