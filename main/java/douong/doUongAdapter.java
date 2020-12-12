package douong;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.baithi.R;
import java.util.List;

public class doUongAdapter extends RecyclerView.Adapter<doUongAdapter.DoUongViewHolder> {
    private List<DoUong> mDoUong;
    public void setData(List<DoUong> list){
        this.mDoUong = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public DoUongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_thucuong, parent, false);
        return new DoUongViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull doUongAdapter.DoUongViewHolder holder, int position) {
        DoUong DoUong = mDoUong.get(position);
        if(DoUong == null){
            return;
        }
        holder.imgDoUong.setImageResource(DoUong.getPhoto());
        holder.tv_name.setText(DoUong.getName());
        holder.tv_gia.setText(DoUong.getGia());
    }

    @Override
    public int getItemCount() {
        if(mDoUong != null){
            return mDoUong.size();
        }
        return 0;
    }

    public  class DoUongViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgDoUong;
        private TextView tv_gia;
        private TextView tv_name;

        public DoUongViewHolder(@NonNull  View itemView){
            super(itemView);
            imgDoUong = itemView.findViewById(R.id.img_thucuong);
            tv_name = itemView.findViewById(R.id.tv_ten);
            tv_name = itemView.findViewById(R.id.tv_tien);
        }
    }

}

