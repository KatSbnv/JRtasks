import java.io.BufferedReader;
import java.io.InputStreamReader;



    public class Solution {
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String text = reader.readLine();
            int N = Integer.parseInt(reader.readLine());
            int i = 0;

            while (i < N){
                System.out.println(text);
                i++;
            }


            //напишите тут ваш код

        }
    }


