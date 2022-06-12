package cyclicrotation;

public class Solution {
    public int[] solution(int[] A, int K){
        int[] newArray = new int[A.length];
        int newPos = 0;

        if(K>A.length&&K%A.length==0){
            return A;
        }
        for(int i=0;i<A.length;i++ ){
            newPos = i+K;
            if((newPos)>=A.length && K<A.length)
                newPos =(A.length+i)%K;
            if((newPos)>=A.length && K>A.length){
                newPos =K%(A.length+i);
            }
            if(newPos%A.length==0){
               newPos=0;
            }
            newArray[newPos] = A[i];
        }
        return newArray;
    }
}
