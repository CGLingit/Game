package com.example.cglin.ultimate_tic_tac_toe;

/**
 * Created by Administrator on 2017/3/23.
 */
import android.app.AltertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class MainFragment extends Fragment{
    private AltertDialog mDialog;

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        View rootView=inflater.inflate(android.R.layout.fragment_main,container,false);
        View aboutButton=rootView.findViewById(R.id.about_button);
        aboutButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                AlterDialog.builder builder=
                        new AlterDialog.Builder(getActivity());
                builder.setTitle(R.string.about_title);
                builder.setMessage(R.string.about_text);
                builder.setCancelable(flase);
                builder.setPositiveButton(R.string.ok_label,new DialogInterface.OnClickListener()){
                    @Override

                            public void onClick(DialogInterface dialogInterface,int i){
                        //方法为空
                    }
                });
                mDialog=builder.show();
            }
        });
        @Override
        public void onPause() {
            super.onPause();
            if(mDialog!=null)
                mDialog.dismiss();
        }

        return rootView;
    }

}
