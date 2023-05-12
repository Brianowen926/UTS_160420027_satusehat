//package com.example.uts_160420027_satusehat.view
//
//import android.provider.ContactsContract
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ImageView
//import android.widget.ProgressBar
//import androidx.recyclerview.widget.RecyclerView
//import com.example.uts_160420027_satusehat.R
//import com.example.uts_160420027_satusehat.model.Notification
//import com.example.uts_160420027_satusehat.util.loadImage
//import kotlinx.android.synthetic.main.notification_list_item.view.*
//
//class ProfileAdapter (val profileList:ArrayList<ContactsContract.Profile>)
//    :RecyclerView.Adapter<NotificationAdapter.NotificationViewHolder>() {
//    class ProfileViewHolder(var view: View) : RecyclerView.ViewHolder(view)
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileAdapter.ProfileViewHolder {
//        val inflater = LayoutInflater.from(parent.context)
//
//        val view = inflater.inflate(R.layout.notification_list_item, parent, false)
//        return ProfileViewHolder(view)
//
//    }
//
////    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
////        holder.view.txtNotifTitle.text = profileList[position].
////        holder.view.txtNotifDescription.text = profileList[position].description
////
////        var imageView = holder.view.findViewById<ImageView>(R.id.imageViewNotification)
////        var progressBar = holder.view.findViewById<ProgressBar>(R.id.progressBarNotification)
////        imageView.loadImage(profileList[position].photoUrl, progressBar)
////    }
//
//    override fun getItemCount(): Int {
//        return profileList.size
//    }
//
//    fun updateNotification(newNotificationList:ArrayList<ContactsContract.Profile>){
//        profileList.clear()
//        notifyDataSetChanged()
//    }
//
//    override fun onBindViewHolder(
//        holder: NotificationAdapter.NotificationViewHolder,
//        position: Int
//    ) {
//        TODO("Not yet implemented")
//    }
//}