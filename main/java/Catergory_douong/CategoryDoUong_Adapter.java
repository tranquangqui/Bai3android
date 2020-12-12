package Catergory_douong;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.baithi.Fragement_douong;
import com.example.baithi.MainActivity;
import com.example.baithi.R;

import java.util.List;

import Category.Category;
import douong.DoUong;
import uudai.uudai_adapter;

public class CategoryDoUong_Adapter extends RecyclerView.Adapter<CategoryDoUong_Adapter.CategoryDoUongViewHolder>{
    private Context mContext;

    private List<Category> mListCategory;
    public CategoryDoUong_Adapter(Context mContext){
        this.mContext = mContext;

    }

    public CategoryDoUong_Adapter(Fragement_douong fragement_douong, List<DoUong> lstDoUong) {
    }

    public void setData(List<Category> list){
        this.mListCategory = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CategoryDoUong_Adapter.CategoryDoUongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category, parent, false);
        return new CategoryDoUong_Adapter.CategoryDoUongViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryDoUong_Adapter.CategoryDoUongViewHolder holder, int position) {
        Category category  = mListCategory.get(position);
        if(category == null){
            return;
        }
        holder.tvNameCategory.setText(category.getNameCategory());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false);
        holder.rcvDoUong.setLayoutManager(linearLayoutManager);
        uudai_adapter uudai_adapter = new uudai_adapter();
        uudai_adapter.setData(category.getUudais());
        holder.rcvDoUong.setAdapter(uudai_adapter);

    }

    @Override
    public int getItemCount() {
        if(mListCategory != null){
            return  mListCategory.size();
        }
        return 0;
    }

    public class CategoryDoUongViewHolder extends RecyclerView.ViewHolder{
        private TextView tvNameCategory;
        private RecyclerView rcvDoUong;
        public CategoryDoUongViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNameCategory=itemView.findViewById(R.id.tv_name_category);
            rcvDoUong=itemView.findViewById(R.id.rcv_uudai);
        }

    }
}
