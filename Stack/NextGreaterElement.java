// package Stack;
import java.util.*;
public class NextGreaterElement{
    public static void main(String[] args){
        int arr[]={4,5,2,25,7,8};  //-> Final NextGreatrer[]= 5 25 25 -1 8 -1 
        Stack<Integer> s = new Stack<>();
        int nextGreater[]=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            //1. While
            while(!s.empty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }

            //2.if-else
            if(s.isEmpty()){
                nextGreater[i]= -1;
            }else{
                nextGreater[i]=arr[s.peek()];
            }
            // push in nextgreater array
            s.push(i);
        }

        for(int i=0;i<nextGreater.length;i++){
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();

    }
}

//5 25 25 -1 8 -1  


//Other Similar Questions

//Q.1 Next grater elements in Right
// for(int i=arr.length-1;i>=0;i--)
//while(!s.empty() && arr[s.peek()]<=arr[i])

//Q.2 Next greater elements in left
// for(int i=0;i<=arr.length;i++)
//while(!s.empty() && arr[s.peek()]<=arr[i])

//Q.3 Next Smaller in Right Side
// for(int i=arr.length-1;i>=0;i--)
// while(!s.empty() && arr[s.peek()]>=arr[i])

//Q.4 Next Smaller in Left Side
// for(int i=0;i<=arr.length;i++)
// while(!s.empty() && arr[s.peek()]>=arr[i])




