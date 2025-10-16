export default async function Article() {
  await fetch("http:/localhost:8090/api/vi/articles");
  return (
    <>
      <div>게시판</div>
    </>
  );
}
