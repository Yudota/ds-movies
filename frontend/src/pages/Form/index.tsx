import FormCard from "components/FormCard";
import { useParams } from "react-router-dom";

export default function Form() {
  const params = useParams();

  console.log(params.movieId);
  return <FormCard movieId={`${params.movieId}`} />;
}
