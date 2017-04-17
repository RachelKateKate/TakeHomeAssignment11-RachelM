package rachelmiller.takehomeassignment11_rachelm;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by rachelmiller on 4/17/17.
 */

public class AssignmentAdapter extends RecyclerView.Adapter<AssignmentViewHolder> {
    private List<Assignment> assignments;
    private Context context;

    public AssignmentAdapter(List<Assignment> assignments, Context context) {
        this.assignments = assignments;
        this.context = context;
    }

    @Override
    public AssignmentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_assignment, parent, false);
        return new AssignmentViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(AssignmentViewHolder holder, int postition) {
        Assignment assignment = assignments.get(postition);
        holder.bind(assignment);
    }

    @Override
    public int getItemCount() {
        return assignments.size();
    }
}
