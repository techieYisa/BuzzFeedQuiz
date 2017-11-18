package view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import nyc.c4q.buzzfeedquiz.R;

/**
 * Created by c4q on 11/18/17.
 */

public class ViewHolder extends RecyclerView.ViewHolder {
    private ImageView background;
    private TextView question;
    private Button option1, option2, option3;


    public ViewHolder(View itemView) {
        super(itemView);
        background = (ImageView) itemView.findViewById(R.id.quiz_backgroundImage_imageview);
        question = (TextView) itemView.findViewById(R.id.quiz_question_textview);
        option1 = (Button) itemView.findViewById(R.id.option1);
        option2 = (Button) itemView.findViewById(R.id.option2);
        option3 = (Button) itemView.findViewById(R.id.option3);
    }
}
