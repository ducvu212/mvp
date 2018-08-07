package com.example.ducvu212.mvp.screen.userlist;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.ducvu212.mvp.R;
import com.example.ducvu212.mvp.data.model.User;
import com.squareup.picasso.Picasso;
import java.util.List;

/**
 * Created by CuD HniM on 18/08/06.
 */
public class UserListAdapter extends RecyclerView.Adapter<UserListAdapter.UserListHolder> {

    private List<User> mGitUser;

    public UserListAdapter(List<User> gitUser) {
        mGitUser = gitUser;
    }

    @NonNull
    @Override
    public UserListHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.user_item, viewGroup, false);
        return new UserListHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserListHolder userListHolder, int i) {
        userListHolder.bindData(mGitUser.get(i));
    }

    @Override
    public int getItemCount() {
        return mGitUser == null ? 0 : mGitUser.size();
    }

    static class UserListHolder extends RecyclerView.ViewHolder {

        private ImageView mImageViewAvar;
        private TextView mTextViewName;
        private TextView mTextViewId;

        UserListHolder(@NonNull View itemView) {
            super(itemView);
            mImageViewAvar = itemView.findViewById(R.id.imageViewAvatar);
            mTextViewName = itemView.findViewById(R.id.textViewName);
            mTextViewId = itemView.findViewById(R.id.textViewId);
        }

        void bindData(User user) {
            Picasso.get()
                    .load(user.getAvatarUrl())
                    .placeholder(R.mipmap.ic_launcher)
                    .into(mImageViewAvar);
            mTextViewId.setText(String.valueOf(user.getId()));
            mTextViewName.setText(user.getLogin());
        }
    }
}
