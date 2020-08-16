## Recursion  
The process in which a function calls itself directly or indirectly is called recursion and the corresponding function is called as recursive function. Examples of such problems are Towers of Hanoi (TOH), Inorder/Preorder/Postorder Tree Traversals, DFS of Graph, etc.  
  
**What is base condition in recursion?**  
In the recursive program, the solution to the base case is provided and the solution of the bigger problem is expressed in terms of smaller problems.  
  
**Why Stack Overflow error occurs in recursion?**  
If the base case is not reached or not defined, then the stack overflow problem may arise.  
  
**What is the difference between direct and indirect recursion?**  
A function fun is called direct recursive if it calls the same function fun. A function fun is called indirect recursive if it calls another function say fun_new and fun_new calls fun directly or indirectly.  

<pre>
  
// An example of direct recursion  
void directRecFun()  
{  
      // Some code....  
      directRecFun();  
      // Some code...  
}  
  
// An example of indirect recursion  
void indirectRecFun1()  
{  
    // Some code...  
    indirectRecFun2();  
    // Some code...  
}  
void indirectRecFun2()  
{  
    // Some code...  
    indirectRecFun1();  
    // Some code...  
}  

</pre>  

  
**What is tail recursion?**  
A recursive function is tail recursive when recursive call is the last thing executed by the function. For example the following C++ function print() is tail recursive.  

<pre>
// An example of tail recursive function 
void print(int n) 
{ 
    if (n < 0)  return; 
    cout << " " << n; 
  
    // The last executed statement is recursive call 
    print(n-1); 
}
</pre>  

**Why do we care?**  
The tail recursive functions considered better than non tail recursive functions as tail-recursion can be optimized by compiler. The idea used by compilers to optimize tail-recursive functions is simple, since the recursive call is the last statement, there is nothing left to do in the current function, so saving the current function’s stack frame is of no use.  
  
**Can a non-tail recursive function be written as tail-recursive to optimize it?**  
  
<pre>
class GFG { 
      
    // A NON-tail-recursive function. The function is not tail recursive because the value by fact(n-1)
    // is used in fact(n) and call to fact(n-1) is not the last thing done by fact(n) 
    static int fact(int n) 
    { 
        if (n == 0) return 1; 
      
        return n*fact(n-1); 
    } 
      
    public static void main(String[] args) 
    { 
        System.out.println(fact(5)); 
    } 
}
  
</pre>  
<pre>
class GFG { 
      
    // A tail recursive function  
    // to calculate factorial 
    static int factTR(int n, int a) 
    { 
        if (n == 0)  
            return a; 
      
        return factTR(n - 1, n * a); 
    } 
      
    // A wrapper over factTR 
    static int fact(int n) 
    { 
        return factTR(n, 1); 
    } 
    public static void main (String[] args) 
    { 
        System.out.println(fact(5)); 
    } 
} 
</pre>  
  
**How memory is allocated to different function calls in recursion?**  
When any function is called from main(), the memory is allocated to it on the stack. A recursive function calls itself, the memory for a called function is allocated on top of memory allocated to calling function and different copy of local variables is created for each function call. When the base case is reached, the function returns its value to the function by whom it is called and memory is de-allocated and the process continues.  

<pre>
class GFG { 
    static void printFun(int test) 
    { 
        if (test < 1) 
            return; 
        else { 
            System.out.printf("%d ", test); 
            printFun(test - 1); // statement 2 
            System.out.printf("%d ", test); 
            return; 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        int test = 3; 
        printFun(test); 
    } 
} 
</pre>
  
When printFun(3) is called from main(), memory is allocated to printFun(3) and a local variable test is initialized to 3 and statement 1 to 4 are pushed on the stack as shown in below diagram. It first prints ‘3’. In statement 2, printFun(2) is called and memory is allocated to printFun(2) and a local variable test is initialized to 2 and statement 1 to 4 are pushed in the stack. Similarly, printFun(2) calls printFun(1) and printFun(1) calls printFun(0). printFun(0) goes to if statement and it return to printFun(1). Remaining statements of printFun(1) are executed and it returns to printFun(2) and so on. In the output, value from 3 to 1 are printed and then 1 to 3 are printed. The memory stack has been shown in below diagram.  
<pre>
<img src="https://user-images.githubusercontent.com/30290570/90332978-4960c080-dfdf-11ea-9187-9dc784bac383.jpg">
</pre>
