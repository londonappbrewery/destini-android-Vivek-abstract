package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTextView;
    Button mAns1Button, mAns2Button;
    int mStoryState = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mTextView = findViewById(R.id.storyTextView);
        mAns1Button = findViewById(R.id.buttonTop);
        mAns2Button = findViewById(R.id.buttonBottom);

        mAns1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryState == 1 || mStoryState == 2) {
                    mTextView.setText(R.string.T3_Story);
                    mAns1Button.setText(R.string.T3_Ans1);
                    mAns2Button.setText(R.string.T3_Ans2);
                    mStoryState = 3;
                } else if (mStoryState == 3) {
                    mTextView.setText(R.string.T6_End);
                    mAns1Button.setText(R.string.reset);
                    mAns2Button.setVisibility(View.INVISIBLE);
                    mStoryState = 4;
                } else if (mStoryState == 4) {
                    // Reset the game
                    mTextView.setText(R.string.T1_Story);
                    mAns1Button.setText(R.string.T1_Ans1);
                    mAns2Button.setText(R.string.T1_Ans2);
                    mAns2Button.setVisibility(View.VISIBLE);
                    mStoryState = 1;
                }
            }
        });

        mAns2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryState == 1) {
                    mTextView.setText(R.string.T2_Story);
                    mAns1Button.setText(R.string.T2_Ans1);
                    mAns2Button.setText(R.string.T2_Ans2);
                    mStoryState = 2;
                } else if (mStoryState == 2) {
                    mTextView.setText(R.string.T4_End);
                    mAns1Button.setText(R.string.reset);
                    mAns2Button.setVisibility(View.INVISIBLE);
                    mStoryState = 4;
                } else if (mStoryState == 3) {
                    mTextView.setText(R.string.T5_End);
                    mAns1Button.setText(R.string.reset);
                    mAns2Button.setVisibility(View.INVISIBLE);
                    mStoryState = 4;
                }
            }
        });

    }
}
