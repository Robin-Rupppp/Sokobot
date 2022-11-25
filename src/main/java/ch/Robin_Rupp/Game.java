package ch.Robin_Rupp;

public class Game {

    private final String PlayArea = """
            ▥▥▥▥▥▥▥▥▥▥▥▥▥▥
            ▥▢▢▢▢▢▢▢▢▢▢▢▢▥
            ▥▢▢▢▢▢▢▢▢▢▢▢▢▥
            ▥▢▢▢▢▢Ω▢▢▢▢▢▢▥
            ▥▢▢▢▢▢▢▢▢▢▢▢▢▥
            ▥▢▢▢▢▢▢▢▢▢▢▢▢▥
            ▥▥▥▥▥▥▥▥▥▥▥▥▥▥
            """;
    public void Play() {
        System.out.println(PlayArea);
        String Choice = Input.inputString("W, A, S, D");
        switch (Choice.toUpperCase()) {
            case "W" -> goUp();
            case "A" -> goLeft();
            case "S" -> goDown();
            case "D" -> goRight();
            default -> System.out.println("That isn't a option");
        }

    }

    private void goRight() {

    }


    private void goDown() {

    }

    private void goLeft() {

    }

    private void goUp() {

    }
}
