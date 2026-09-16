public class FizzBuzz {
    public String convertir(int nombre){
        if (nombre % 3 == 0 && nombre % 5 == 0){
            return "FizzBuzz";
        } else if (nombre %3 == 0) {
            return "Fizz";
        }else if (nombre %5 == 0) {
            return "Buzz";
        }
        return String.valueOf(nombre);
    }
}
