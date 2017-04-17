package rachelmiller.takehomeassignment11_rachelm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Assignment> assignments;
    private AssignmentAdapter assignmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        assignmentAdapter = new AssignmentAdapter(assignments, this);
        recyclerView.setAdapter(assignmentAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_item_save:
                assignments.add(getRandomAssignment());
                assignmentAdapter.notifyDataSetChanged();   // this is important to inform the program that data has changed
                Toast.makeText(this, "Assignment added", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void initialData() {
        assignments = new ArrayList<>();
        assignments.add(new Assignment("English", "due on Monday", R.drawable.english));
        assignments.add(new Assignment("Math", "due on Tuesday", R.drawable.math));
        assignments.add(new Assignment("Java", " due always", R.drawable.java));
    }

    private Assignment getRandomAssignment() {
        int num = (int) (Math.random() * 5);
        if (num == 0)
            return new Assignment("English", "due on Monday ", R.drawable.english);
        else if (num == 1)
            return new Assignment("Math", "due on Tuesday ", R.drawable.math);
        else
            return new Assignment("Java", "due always", R.drawable.java);
    }

}

