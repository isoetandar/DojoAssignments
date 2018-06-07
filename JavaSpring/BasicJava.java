import java.util.ArrayList;
public class BasicJava {
    public void print1To255(){
        int i;
        for (i=1; i<256; i++){
            System.out.print(Integer.toString(i)+" ");
        }
    }

    public void printOdd255(){
        int j;
        for(j=1; j<256; j +=2){
            System.out.print(Integer.toString(j)+" ");
        }
    }

    public void printSum255(){
        int k;
        int sum=0;
        for(k=0; k<256; k++){
            sum = sum +k;
            System.out.println("New number: "+ Integer.toString(k)+" Sum: "+
            Integer.toString(sum));
        }
    }

    public void iterateArray(int[] arr){
        int i;
        for (i=0; i<arr.length; i++){
            System.out.print(Integer.toString(arr[i])+" ");
        }

    }

    public Integer findMax(int[] arr){
        int i;
        int Max=arr[0];
        for (i=0; i<arr.length; i++){
            if (arr[i]>Max){
                Max = arr[i];
            }
        }
        return Max;
    }

    public Double getAverage (int[] arr){
        int i;
        double Sum =0;
        double Avg =0;
        for (i=0; i<arr.length; i++){
            Sum += arr[i];
        }
        Avg = Sum/arr.length;
        return Avg;
    }
	
    public void arrayOddUpTo255 (){
        ArrayList<Integer> n = new ArrayList<Integer>();
        int i;
        for (i=1; i<256; i+=2 ){
            n.add(i);
        }
        System.out.println(n);
    }

    public Integer greaterThan(int[] arr, int Y){
        int i;
        int count=0;
        for (i=0; i<arr.length; i++){
            if (arr[i]>Y){
                count++;
            }
        }
        return count;
    }

    public int[] square(int[] arr){
		for(int i = 0; i<arr.length; i++){
			arr[i] = arr[i]*arr[i];
		}
		return arr;
	}

} 