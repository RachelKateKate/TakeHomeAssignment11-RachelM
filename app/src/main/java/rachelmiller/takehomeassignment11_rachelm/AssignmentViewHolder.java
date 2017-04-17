package rachelmiller.takehomeassignment11_rachelm;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rachelmiller on 4/17/17.
 */

public class AssignmentViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private TextView assignmentNameView;
    private TextView dueDateView;
    private ImageView assignmenttypeView;
    private Context context;

    public AssignmentViewHolder(View itemView, Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        assignmentNameView = (TextView) itemView.findViewById(R.id.assignment_name);
        dueDateView = (TextView) itemView.findViewById(R.id.dueDate);
        assignmenttypeView = (ImageView) itemView.findViewById(R.id.assignmenttype);
        this.context = context;
    }

    public void bind(final Assignment assignment) {
        assignmentNameView.setText(assignment.assignmentName);
        dueDateView.setText(assignment.dueDate);
        assignmenttypeView.setImageResource(assignment.photoId);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Assignment t = new Assignment(assignment.assignmentName, assignment.dueDate, assignment.photoId);
                Intent i = new Intent(context, activity_assignment_info.class);
                i.putExtra(Keys.ASSIGNMENT, t);
                context.startActivity(i);

                Toast.makeText(context, assignmentNameView.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
