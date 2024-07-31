public class series {
    public static void main(String args[]){
    //     String series="";
    //     for (int i=0;i<26;i++){
    //         char c=(char)('A'+i);
    //         series+=c;
    //         System.out.println((char)('A'+i));
    //     }
    //     System.out.println(series);
    // }
    StringBuilder x = new StringBuilder();
    for (int i=0;i<26;i++){
        char c=(char)('A'+i);
        x.append(c);
    }
    System.out.println(x);
    
}
}
