package lambdaexpression;

@SuppressWarnings("serial")
public class UserException extends Exception {
    /**
     * this method creates exception for invalid outcomes
     *
     * @return error message as Invalid output or failure
     *
     */
    String errorMessage;
    UserException(String message) {
        this.errorMessage = message;
    }
}
