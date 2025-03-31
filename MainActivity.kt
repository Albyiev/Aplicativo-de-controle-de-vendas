class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val db = Firebase.firestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Exemplo rápido: Salvar produto no Firestore
        binding.btnSave.setOnClickListener {
            val product = hashMapOf(
                "name" to "Produto Teste",
                "price" to 19.99
            )
            db.collection("products").add(product)
                .addOnSuccessListener { showToast("Salvo!") }
        }
    }
