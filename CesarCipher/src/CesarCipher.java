public class CesarCipher {
    protected char[] encoder = new char[26];
    protected char[] decoder = new char[26];
    public  CesarCipher(int rotation){
        for( int k = 0 ; k<26 ; k++){
            encoder[k] = (char)('A' + (k+rotation)%26);
            decoder[k] = (char)('A' + (k-rotation + 26)%26);
        }
    }

}
