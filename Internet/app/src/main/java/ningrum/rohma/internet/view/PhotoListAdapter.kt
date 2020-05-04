package ningrum.rohma.internet.view

class PhotoListAdapter (var photos: ArrayList<Photo>) : RecyclerView.Adapter<PhotoListAdapter.ViewHolder>() {

    fun updatePhotos(newPhotos: List<Photo>) {
        photos.clear()
        photos.addAll(newPhotos)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int) = ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
    )

    override fun getItemCount() = photos.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(photos[position])
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(photos: Photo) {
            itemView.tvTitle.text = photos.title
            itemView.setOnClickListener { view ->
                Toast.makeText(itemView.context,"Hello",Toast.LENGTH_LONG).show()
            }
            Glide.with(itemView.context).load(photos.thumbnail).into(itemView.imageView)
        }
    }
}
