package rachelmiller.takehomeassignment11_rachelm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_assignment_info extends AppCompatActivity {

    private ImageView assignmenttype;
    private TextView assignmentName;
    private TextView dueDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment_info);

        assignmenttype = (ImageView) findViewById(R.id.assignmenttype_detail);
        assignmentName = (TextView) findViewById(R.id.assignment_name_detail);
        dueDate = (TextView) findViewById(R.id.dueDate_detail);

        Intent i = getIntent();
        Assignment t = (Assignment) i.getSerializableExtra(Keys.ASSIGNMENT);

        assignmenttype.setImageResource(t.getPhotoId());
        assignmentName.setText(t.getAssignmentName());
        dueDate.setText(t.getDueDate());
    }
}
