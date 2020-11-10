public class CastingEx01 {
    public static void main(String[] args) {

        // 형 변환
        // 작은 타입 => 큰 타입 : 자동 형 변환
        int intValue = 10302977;
        System.out.println( intValue );

        // byte byteValue = intValue;  <- error: incompatible types
        //큰 타입 => 작은 타입 : 강제 형 변환
        // 강제 형 변환 (byte)
        byte byteValue = (byte)intValue;
        
        System.out.println( byteValue );
    }
}