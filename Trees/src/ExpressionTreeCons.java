import java.util.Stack;
/**
 * Node class
 */
class NodeCons{
    char value;
    NodeCons left,right;
    NodeCons(char value){
        left=right=null;
        this.value=value;
    }
}

/**
 * Expression Tree construction class
 */
public class ExpressionTreeCons {
    NodeCons root;
    ExpressionTreeCons(){
        root=null;
    }

    /**
     * Function to check if character is Operand or not.
     * @param operand character
     * @return true if operator else false
     */
    public boolean isOperator(char operand){
        return operand == '+' || operand == '-' || operand == '*' || operand == '/';
    }

    /**
     * Construct Tree method
     * @param postfix postfix expression array
     * @return root of expression tree
     */
    public NodeCons construct(char[] postfix){
        Stack<NodeCons> stack=new Stack<>();
        NodeCons t,t1,t2;

        //iterate through postfix array
        for(int i=0;i<postfix.length;i++){
            //If it is operand, push into stack
            if(!isOperator(postfix[i])){
                t = new NodeCons(postfix[i]);
                stack.push(t);
            }
            //If it is operator
            else{
                //t contains operator
                t=new NodeCons(postfix[i]);
                //pop two operands
                t1 = stack.pop();
                t2 = stack.pop();
                t.right=t1;
                t.left=t2;
                stack.push(t);
            }
        }
        t=stack.peek();
        stack.pop();
        //return root
        return t;
    }

    /**
     * Inorder traversal of Expression Tree
     * @param root root of Expression Tree
     */
    public void inorder(NodeCons root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.value+ " ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {

        ExpressionTreeCons expressionTreeCons=new ExpressionTreeCons();
        String postFixExp="ab+ef*g*-";
        char[] charArray=postFixExp.toCharArray();
        NodeCons root = expressionTreeCons.construct(charArray);
        System.out.println("Infix Expression is");
        expressionTreeCons.inorder(root);
    }
}
