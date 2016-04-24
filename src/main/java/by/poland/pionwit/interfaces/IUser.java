package by.poland.pionwit.interfaces;

public interface IUser {

    /**
     * Проверка на наличие в базе mail
     *
     * @param email
     */
    public boolean isSetEmail(String email);

    /**
     * Проверка на наличие в базе имени
     *
     * @param name
     */
    public boolean isSetName(String name);

    /**
     * Проверка на наличие в базе password
     *
     * @param password
     */
    public boolean isSetPassword(String password);

    /**
     * Проверка на корректность в базе mail and password
     *
     * @param email
     * @param password
     */
    public boolean isSetUserCorrect(String email, String password);
}
