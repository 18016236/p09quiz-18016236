package sg.edu.rp.soi.c346p09quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvFormula;
    ArrayList<MathFormula>FormulaList;
    //ArrayAdapter<AndroidVersion>aaOS;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvFormula = findViewById(R.id.lv);

        FormulaList = new ArrayList<>();
        FormulaList.add(new MathFormula("Area of rectangle","Length x Length"));
        FormulaList.add(new MathFormula("Area of triangle","Length of base x Length x 2"));
        FormulaList.add(new MathFormula("Volume of cube","Length x Length x Length"));

        adapter = new CustomAdapter(this,R.layout.row,FormulaList);

        lvFormula.setAdapter(adapter);
    }
}
