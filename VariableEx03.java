public class VariableEx03 {
    public static void main(String[] args) {
        char c1 = 'a'; // ' ' : 문자
        
        // char c2 = "a"; // " " : 문자열
        //char c2 = 'ab'; ' ' 안에는 한 글자만!
        
        char c2 = '한';
        // ASCII -  영문/ 특수 글자는 코드값으로 처리
        // a : 97 ~ / A : 65 ~
        char c3 = 97 + 1;
        // unicode - 다국어
        char c4 = '\uc790';

        System.out.println( c3 );       

        // 이스케이프 코드
        // \n \t \' \" 모두 사용 가능

        char s1 = 'a';
        char s2 = '\t';
        char s3 = 'b';

        System.out.println( "" + s1 + s2 + s3 );
                

    }
}