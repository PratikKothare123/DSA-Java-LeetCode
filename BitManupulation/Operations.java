package BitManupulation;

public class Operations {
     

    public static int getBit(int n, int i){

    int bitMask = 1 << i;

    if((n & bitMask) == 0){
        return 0;
    }

    return 1;
}


public static int setBit(int n,int i){

    int bitMask = 1 << i;

    return n | bitMask;
}

public static int clearBit(int n,int i){

    int bitMask = ~(1<<i);

    return n & bitMask;
}

public static int updateIthBit(int n,int i,int newbit){
    if(newbit==0){
       return clearBit(n, i);
    }else{
        return setBit(n, i);
    }
}

public static int clearLastIBits(int n,int i){

    return n & (~0 << i);
}
    public static void main(String[] args) {
    
        // System.out.println("getBit: "+getBit(15,2));
        // System.out.println("setBit: "+setBit(10,2));
        // System.out.println("clearBit: "+clearBit(10,1));
        // System.out.println("clearBit: "+clearBit(10,1));
        System.out.println("clearLastIBits: "+clearLastIBits(15,2));
    
    }
}
