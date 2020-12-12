package uudai;

import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.baithi.R;

import java.util.List;

public class uudai_adapter extends RecyclerView.Adapter<uudai_adapter.UuDaiViewHolder> {

    private List<uudai> mUuDai;
    public void setData(List<uudai> list){
        this.mUuDai = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public UuDaiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_uudai, parent, false);

        return new UuDaiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UuDaiViewHolder holder, int position) {
        uudai uudai = mUuDai.get(position);
        if(uudai == null){
            return;
        }
        holder.imgUuDai.setImageResource(uudai.getResourceId());
        holder.tvUuDai.setText(uudai.getTitle());
//        holder.btnUuDai.setText(uudai.getTitle());
    }



    @Override
    public int getItemCount() {
        if(mUuDai != null){
            return mUuDai.size();
        }
        return 0;
    }

    public  class UuDaiViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgUuDai;
        private TextView tvUuDai;
//        private Button btnUuDai;

        public UuDaiViewHolder(@NonNull  View itemView){
            super(itemView);

            imgUuDai = itemView.findViewById(R.id.img_uudai);
            tvUuDai = itemView.findViewById(R.id.tv_uudai);
//            btnUuDai = itemView.findViewById(R.id.btn_uudai);
        }
    }

}
