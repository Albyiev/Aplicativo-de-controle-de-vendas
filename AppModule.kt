@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    fun provideFirestore(): FirebaseFirestore = Firebase.firestore
}
