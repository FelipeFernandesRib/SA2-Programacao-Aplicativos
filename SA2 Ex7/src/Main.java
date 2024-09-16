/*
 7. Altere o código a seguir, para o menor número de linhas possível, mantendo o mesmo resultado:
 print("    *")
 print("    *")
 print("  *   *")
 print(" *     *")
 print("***   ***")
 print("  *   *")
 print("  *   *")
 print("  *****")
 */

public class Main {
    public static void main(String[] args) {
        String [] seta = {"    *", "    *","  *   *"," *     *","***   ***","  *   *", "  *   *","  *****"};
        for (int i = 0; i < seta.length; i++) {
            System.out.println(seta[i]);
        }
    }
}