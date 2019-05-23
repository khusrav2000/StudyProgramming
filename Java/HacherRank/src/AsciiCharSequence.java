public class AsciiCharSequence implements CharSequence{
    byte[] array;
    AsciiCharSequence(byte[] array){
        this.array = array;
    }

    @Override
    public int length() {
        return array.length;
    }

    @Override
    public char charAt(int index) {
        return (char) array[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return toString().substring(start,end-1);
    }
    @Override
    public String toString(){
        String str = new String(array);
        return str;
    }
}




