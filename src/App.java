public class App {
    public static void main(String[] args) {
        System.out.println(hash("Hello World!"));
    }
    public static String hash(String data){
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","1","2","3","4","5","6","7","8","9","0"};
        byte[] bytes = data.getBytes();
        StringBuilder builder = new StringBuilder();
        for(byte b : bytes){
            if(b<alphabet.length){
                builder.append(alphabet[b]);
            }else{
                int fir = 0;
                int i = b;
                for(int j = 0; j < i; j++){
                    if(j%5==0 && j < alphabet.length){
                        fir++;
                    }
                    if(j>alphabet.length){
                        break;
                    }
                }
                for(int k = 0; k < fir+1; k++){
                    builder.append(alphabet[k]);
                }
            }
        }
        return builder.toString();
    }
}