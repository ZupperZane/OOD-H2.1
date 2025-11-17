package src.Task3;

public interface Validation {
    void NextVal(Validation next);
    void validate(Registration request) throws Exception;
}
