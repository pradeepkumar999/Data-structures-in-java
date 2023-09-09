
public class QueueArr {

    public static class Queue{
        static int arr[];
        static int n;
        static int rear=-1;

        Queue(int n){
            arr=new int[n];
            this.n=n;
        }

        public static boolean isEmpty() {
           return rear==-1;
        }

        public static void add(int data){
            if(rear==n-1){
                System.out.println("Full Queue");
                return;
            }
            rear++;
            arr[rear]=data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int front=arr[0];

            for(int i=0;i<rear;i++)
            {
                arr[i]=arr[i+1];
            }
            rear--;

            return front;

        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            

            return arr[0];

        }

    }
    public static void main(String args[]){

        Queue qa=new Queue(5);

        qa.add(1);
        qa.add(2);
        qa.add(3);

        while(!qa.isEmpty()){
            System.out.println(qa.peek());
            qa.remove();
        }

        
        

    }
}
