public class StaticArray{
    public static void main(String[] args){
        int [] numbers=new int[5];
        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;
        numbers[3]=40;
        numbers[4]=50;
        System.out.println("Elements of the Static arrray:");
        for(int i=0;i<numbers.length;i++){
            System.out.println("Elements at Index"+ i + ":"+ numbers[i]);
        }
    }
}
