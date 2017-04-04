import java.util.Scanner;

/**
 * Created by Hrant on 4/1/2017.
 */
public class TestStupidViews {
    static int counter = 0;
    int inputNumber;

    public void init(){


        ViewGroup viewGroup =  new ViewGroup();

        Button button1 = new Button("Button one");
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(v.toString() + " clicked" + "\n");
            }
        });
        viewGroup.addView(button1);

        Button button2 = new Button("Button two");
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                System.out.println(v.toString() + " clicked." + "  Counter:" + counter + "\n");
            }
        });
        viewGroup.addView(button2);

        Spinner spinner = new Spinner();
        spinner.addItem("one", "two", "three");
        spinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spinner.setOpened(!spinner.isOpened());
                if( spinner.isOpened()) System.out.println("Spinner is opened" + "\n");
                else System.out.println("Spinner is closed" + "\n");
            }
        });
        viewGroup.addView(spinner);

        CheckBox checkBox1 = new CheckBox("Checkbox 1");
        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkBox1.setChecked(!checkBox1.isChecked());
                if(checkBox1.isChecked()) System.out.println(v.toString() + " is checked" + "\n");
                else System.out.println(v.toString() + " is unchecked" + "\n");
            }
        });
        viewGroup.addView(checkBox1);

        CheckBox checkBox2 = new CheckBox("Checkbox 2");
        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkBox2.setChecked(!checkBox2.isChecked());
                if(checkBox2.isChecked()) System.out.println(v.toString() + " is checked" + "\n");
                else System.out.println(v.toString() + " is unchecked" + "\n");
            }
        });
        viewGroup.addView(checkBox2);

        viewGroup.draw();
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while(check) {
            System.out.println("\n" + "Please type button number, check Checker2 for exit: ");
            inputNumber = scanner.nextInt();
            switch (inputNumber) {
                case 1:
                    button1.performClick();
                    break;
                case 2:
                    button2.performClick();
                    break;
                case 3:
                    spinner.performClick();
                    break;
                case 4:
                    checkBox1.performClick();
                    break;
                case 5:
                    checkBox2.performClick();
                    check = false;
                    break;
            }
            viewGroup.draw();
        }
    }
}
