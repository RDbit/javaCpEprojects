package CPEProblem3;
import javax.swing.JOptionPane;

public class NumberConverter {
    public static void main(String[] args) {
       
        String decimalInput = JOptionPane.showInputDialog("Enter a positive decimal value:");
        int decimal = Integer.parseInt(decimalInput);
        
       
        String options = "value to which number system:\n1 – Decimal to Binary\n2 – Decimal to Octal\n3 – Decimal to Hexadecimal";
        String choiceInput = JOptionPane.showInputDialog(options);
        int choice = Integer.parseInt(choiceInput);
        
        String result = "";
        
        switch (choice) {
            case 1:
                int[] binary = new int[32];
                int index = 0;
                int temp = decimal;
                
                if (temp == 0) {
                    binary[index++] = 0;
                } else {
                    while (temp > 0) {
                        binary[index++] = temp % 2;
                        temp /= 2;
                    }
                }
                
                
                StringBuilder binaryStr = new StringBuilder();
                for (int i = index - 1; i >= 0; i--) {
                    binaryStr.append(binary[i]);
                }
                result = "Equivalent of " + decimal + " in binary is " + binaryStr.toString();
                break;
                
            case 2: 
                int[] octal = new int[32];
                index = 0;
                temp = decimal;
                
                if (temp == 0) {
                    octal[index++] = 0;
                } else {
                    while (temp > 0) {
                        octal[index++] = temp % 8;
                        temp /= 8;
                    }
                }
                
                
                StringBuilder octalStr = new StringBuilder();
                for (int i = index - 1; i >= 0; i--) {
                    octalStr.append(octal[i]);
                }
                result = "Equivalent of " + decimal + " in octal is " + octalStr.toString();
                break;
                
            case 3: 
                char[] hex = new char[32];
                index = 0;
                temp = decimal;
                
                if (temp == 0) {
                    hex[index++] = '0';
                } else {
                    while (temp > 0) {
                        int remainder = temp % 16;
                        if (remainder < 10) {
                            hex[index++] = (char)(remainder + '0');
                        } else {
                            hex[index++] = (char)(remainder - 10 + 'A');
                        }
                        temp /= 16;
                    }
                }
                
                
                StringBuilder hexStr = new StringBuilder();
                for (int i = index - 1; i >= 0; i--) {
                    hexStr.append(hex[i]);
                }
                result = "Equivalent of " + decimal + " in hexadecimal is " + hexStr.toString();
                break;
                
            default:
                result = "Invalid choice";
        }
        
        JOptionPane.showMessageDialog(null, result);
    }
}