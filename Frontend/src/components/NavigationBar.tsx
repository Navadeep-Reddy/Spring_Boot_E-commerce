import { Button } from "./ui/button";
import { Input } from "./ui/input";
function NavigationBar() {
  return (
    <nav className="fixed top-0 w-[100%] shadow-sm flex items-center px-10 justify-between bg-neutral">
      <h1 className="text-3xl font-extrabold text-white">Fastify</h1>
      <ul className="flex  justify-center gap-x-5 font-bold  text-[20px] text-white my-5">
        <li className="hover:text-secondary duration-100">Home</li>
        <li className="hover:text-secondary duration-100">Add Product</li>
        <li className="hover:text-secondary duration-100">Categories</li>
      </ul>
      <div className="flex gap-x-2">
        <Button className="rounded-4xl bg-primary text-white">Search</Button>
        <Input className="bg-secondary" />
      </div>
    </nav>
  );
}

export default NavigationBar;
