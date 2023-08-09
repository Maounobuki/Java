package exhw3;

public class PasswordVerifier {

    /**
     * @isValid метод проверяющий условие содержания в пароле:
     *                1. 8ми символов.
     *                2. Цифры.
     *                3.Заглавной буквы.
     *                Доступ к методу осуществляется через экземпляр класса
     */
    public void isValid(String password) {
        if (password.length() < 8) {
            throw new IllegalArgumentException("Пароль должен быть не менее 8 символов");
        }

        boolean containsDigit = false;
        boolean containsUpperCase = false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                containsDigit = true;
            }
            if (Character.isUpperCase(c)) {
                containsUpperCase = true;
            }

            if (containsDigit = false) {
                throw new IllegalArgumentException("Пароль должен содержать хотя бы одну цифру ");

            }
            if (containsUpperCase = false) {
                throw new IllegalArgumentException("Пароль должен содержать и хотя бы одну заглавную букву");

            }
            else
        {
            return;
        }
        }
    }
}
