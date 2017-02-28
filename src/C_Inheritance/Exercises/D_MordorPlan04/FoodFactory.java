package C_Inheritance.Exercises.D_MordorPlan04;

abstract class FoodFactory {
    private int _points;

    int getPoints() {
        return this._points;
    }

    void eatFood(String food) {
        switch (food.toLowerCase()) {
            case "cram":
                this._points += 2;
                break;
            case "lembas":
                this._points += 3;
                break;
            case "apple":
                this._points += 1;
                break;
            case "melon":
                this._points += 1;
                break;
            case "honeycake":
                this._points += 5;
                break;
            case "mushrooms":
                this._points -= 10;
                break;
            default:
                this._points -= 1;
                break;
        }
    }
}
