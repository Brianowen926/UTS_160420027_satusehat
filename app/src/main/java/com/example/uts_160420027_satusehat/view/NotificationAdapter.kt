package com.example.uts_160420027_satusehat.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.recyclerview.widget.RecyclerView
import com.example.uts_160420027_satusehat.R
import com.example.uts_160420027_satusehat.model.Notification
import com.example.uts_160420027_satusehat.util.loadImage
import kotlinx.android.synthetic.main.notification_list_item.view.*

class NotificationAdapter(val notificationList:ArrayList<Notification>)
    :RecyclerView.Adapter<NotificationAdapter.NotificationViewHolder>() {
    class NotificationViewHolder(var view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        val view = inflater.inflate(R.layout.notification_list_item, parent, false)
        return NotificationViewHolder(view)

}

    override fun onBindViewHolder(holder: NotificationViewHolder, position: Int) {
        holder.view.txtNotifTitle.text = notificationList[position].title
        holder.view.txtNotifDescription.text = notificationList[position].description

        var imageView = holder.view.findViewById<ImageView>(R.id.imageViewNotification)
        var progressBar = holder.view.findViewById<ProgressBar>(R.id.progressBarNotification)
        imageView.loadImage(notificationList[position].photoUrl, progressBar)
    }

    override fun getItemCount(): Int {
        return notificationList.size
    }

    fun updateNotification(newNotificationList:ArrayList<Notification>){
        notificationList.clear()
        notificationList.addAll(newNotificationList)
        notifyDataSetChanged()
    }
}