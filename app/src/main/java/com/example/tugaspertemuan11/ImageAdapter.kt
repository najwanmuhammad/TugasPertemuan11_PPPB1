package com.example.tugaspertemuan11

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.tugaspertemuan11.databinding.ItemImageBinding

class ImageAdapter (private val listImage: List<Image>) :
    RecyclerView.Adapter<ImageAdapter.ItemImageHolderView>() {


    class ItemImageHolderView(private val binding: ItemImageBinding) : RecyclerView.ViewHolder(binding.root) {
        val imageView: ImageView = itemView.findViewById(R.id.image_path)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemImageHolderView {
        val binding = ItemImageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemImageHolderView(binding)
    }

    override fun getItemCount(): Int {
        return listImage.size
    }

    override fun onBindViewHolder(holder: ItemImageHolderView, position: Int) {
        val imageItem = listImage[position]
        holder.imageView.setImageResource(imageItem.addressImage)
    }

}