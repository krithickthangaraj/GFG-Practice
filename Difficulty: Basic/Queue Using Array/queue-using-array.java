//{ Driver Code Starts
import java.util.Scanner;

class GfG
{
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
		 {
			MyQueue obj = new MyQueue();
			int Q = sc.nextInt();
			while(Q>0)
			{
				int QueryType = 0;
				QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					
					obj.push(a);
					
				}else if(QueryType == 2)
				{
				System.out.print(obj.pop()+" ");
				}
				Q--;
			}
			System.out.println("");
			t--;
		 
System.out.println("~");
}
	}
}




// } Driver Code Ends




class MyQueue {

    int front=-1, end=-1;
	int arr[] = new int[100005];

   	
	int size=0;
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	   if(size==arr.length) return;
	   if(size==0) 
	   {
	       front=0;
	       end=0;
	   }
	   
	   else{
	       end=(end+1)%arr.length;
	       
	   }
	   arr[end]=x;
	   size++;
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
	   if(size==0) return -1;
	   int ch=arr[front];

       if(size==1) 
	   {
	       front=-1;
	       end=-1;
	   }	   
	   front=(front+1)%arr.length;
	   size--;
	   return ch;
	} 
}




